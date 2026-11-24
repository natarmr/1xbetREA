.class public final La/b0g;
.super La/ii30;
.source "SourceFile"


# instance fields
.field public final q:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(La/akj0;Landroid/graphics/RectF;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, La/ii30;-><init>(La/zjj0;)V

    .line 10
    iput-object p2, p0, La/b0g;->q:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(La/b0g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, La/ii30;-><init>(La/ii30;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, La/b0g;->q:Landroid/graphics/RectF;

    .line 5
    .line 6
    iput-object p1, p0, La/b0g;->q:Landroid/graphics/RectF;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    new-instance v0, La/d0g;

    .line 2
    .line 3
    invoke-direct {v0, p0}, La/ki30;-><init>(La/ii30;)V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, La/d0g;->i1:La/b0g;

    .line 7
    .line 8
    invoke-virtual {v0}, La/ki30;->invalidateSelf()V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
