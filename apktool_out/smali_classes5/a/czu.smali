.class public final La/czu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ost0;


# direct methods
.method public constructor <init>(La/ost0;B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/czu;->a:La/ost0;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/czu;->a:La/ost0;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 1
    iget-object p0, p0, La/czu;->a:La/ost0;

    .line 2
    .line 3
    iget-object p0, p0, La/ost0;->a:La/ulk;

    .line 4
    .line 5
    iget-object p0, p0, La/ulk;->a:La/vwb0;

    .line 6
    .line 7
    const-string v0, "AUTO_CLEAR_COUPON_AFTER_BET"

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-static {p0, v0, v1}, La/ua80;->x(La/vwb0;Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method
