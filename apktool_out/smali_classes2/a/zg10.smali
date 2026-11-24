.class public final synthetic La/zg10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:La/w6k;

.field public final synthetic b:I

.field public final synthetic c:F


# direct methods
.method public synthetic constructor <init>(La/w6k;IF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/zg10;->a:La/w6k;

    iput p2, p0, La/zg10;->b:I

    iput p3, p0, La/zg10;->c:F

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, La/zg10;->c:F

    .line 2
    .line 3
    iget v1, p0, La/zg10;->b:I

    .line 4
    .line 5
    int-to-float v1, v1

    .line 6
    sub-float/2addr v1, v0

    .line 7
    const/high16 v0, 0x40000000    # 2.0f

    .line 8
    .line 9
    div-float/2addr v1, v0

    .line 10
    iget-object p0, p0, La/zg10;->a:La/w6k;

    .line 11
    .line 12
    invoke-interface {p0, v1}, La/w6k;->s0(F)F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    new-instance v0, La/ycl;

    .line 17
    .line 18
    invoke-direct {v0, p0}, La/ycl;-><init>(F)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method
