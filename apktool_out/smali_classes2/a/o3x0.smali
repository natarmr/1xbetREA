.class public final La/o3x0;
.super La/giw0;
.source "SourceFile"


# instance fields
.field public final synthetic c:B


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/o3x0;->c:B

    invoke-direct {p0, p1}, La/giw0;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(La/h0q0;Ljava/util/List;)La/jlw0;
    .locals 0

    .line 1
    iget-byte p1, p0, La/o3x0;->c:B

    .line 2
    .line 3
    sget-object p2, La/jlw0;->V0:La/wlw0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    return-object p2

    .line 9
    :pswitch_0
    new-instance p0, La/ihw0;

    .line 10
    .line 11
    const-wide/16 p1, 0x0

    .line 12
    .line 13
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {p0, p1}, La/ihw0;-><init>(Ljava/lang/Double;)V

    .line 18
    .line 19
    .line 20
    :pswitch_1
    return-object p0

    .line 21
    :pswitch_2
    return-object p2

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
