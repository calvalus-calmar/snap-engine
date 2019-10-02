package org.esa.snap.remote.products.repository;

import java.awt.image.BufferedImage;
import java.util.Date;
import java.util.List;

/**
 * Created by jcoravu on 12/8/2019.
 */
public interface RepositoryProduct {

    public Polygon2D getPolygon();

    public List<Attribute> getAttributes();

    public String getName();

    public long getApproximateSize();

    public String getDownloadQuickLookImageURL();

    //TODO Jean rename method
    public String getDownloadURL();

    public Date getAcquisitionDate();

    public String getMission();

    public void setQuickLookImage(BufferedImage quickLookImage);

    public BufferedImage getQuickLookImage();

    public PixelType getPixelType();

    public DataFormatType getDataFormatType();

    public SensorType getSensorType();

    public String getEntryPoint();
}