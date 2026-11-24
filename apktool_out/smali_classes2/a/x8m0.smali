.class public final La/x8m0;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:La/y8m0;


# direct methods
.method public synthetic constructor <init>(La/y8m0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x8m0;->a:B

    iput-object p1, p0, La/x8m0;->b:La/y8m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/x8m0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/x8m0;->b:La/y8m0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, La/y8m0;->c:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/y8m0;->b:La/ffk;

    .line 13
    .line 14
    invoke-static {p0}, La/obb;->P(La/wm40;)La/f0d0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, La/q3d;->k(Ljava/lang/Object;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object p0, La/iun;->a:La/iun;

    .line 24
    .line 25
    :goto_0
    return-object p0

    .line 26
    :pswitch_0
    iget-object p0, p0, La/y8m0;->b:La/ffk;

    .line 27
    .line 28
    invoke-static {p0}, La/obb;->Q(La/wm40;)La/fyj0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {p0}, La/obb;->R(La/wm40;)La/fyj0;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    filled-new-array {v0, p0}, [La/fyj0;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
