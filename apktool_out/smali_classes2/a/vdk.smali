.class public final La/vdk;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:La/wdk;


# direct methods
.method public synthetic constructor <init>(La/wdk;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vdk;->a:B

    iput-object p1, p0, La/vdk;->b:La/wdk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/vdk;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/vdk;->b:La/wdk;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, La/wdk;->b:La/wsy;

    .line 10
    .line 11
    invoke-static {p0}, La/xtt0;->d(La/e83;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    iget-object v0, p0, La/wdk;->b:La/wsy;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, La/wdk;->D(La/wsy;)La/fhy;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
