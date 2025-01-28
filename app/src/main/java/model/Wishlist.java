package model;

public class Wishlist {
    private int wishlistId;
    private int userId;
    private int productId;

    public Wishlist(int wishlistId, int productId, int userId) {
        this.wishlistId = wishlistId;
        this.productId = productId;
        this.userId = userId;
    }

    public int getWishlistId() {
        return wishlistId;
    }

    public void setWishlistId(int wishlistId) {
        this.wishlistId = wishlistId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
