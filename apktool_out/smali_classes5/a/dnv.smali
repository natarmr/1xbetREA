.class public final La/dnv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/hm7;


# direct methods
.method public constructor <init>(La/hm7;B)V
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
    iput-object p1, p0, La/dnv;->a:La/hm7;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/dnv;->a:La/hm7;

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
    iget-object p0, p0, La/dnv;->a:La/hm7;

    .line 2
    .line 3
    iget-object p0, p0, La/hm7;->a:La/h03;

    .line 4
    .line 5
    iget-object p0, p0, La/h03;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/vwb0;

    .line 8
    .line 9
    const-string v0, "CLEAR_COUPON_AFTER_BET"

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {p0, v0, v1}, La/ua80;->x(La/vwb0;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method
