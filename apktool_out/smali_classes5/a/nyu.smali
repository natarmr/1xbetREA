.class public final La/nyu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/iqp0;


# direct methods
.method public constructor <init>(La/iqp0;B)V
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
    iput-object p1, p0, La/nyu;->a:La/iqp0;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/nyu;->a:La/iqp0;

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
.method public a(I)La/p6d;
    .locals 4

    .line 1
    iget-object v0, p0, La/nyu;->a:La/iqp0;

    .line 2
    .line 3
    iget-object v0, v0, La/iqp0;->a:La/aqp0;

    .line 4
    .line 5
    iget-object v0, v0, La/aqp0;->e:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/lnq;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v1, v0, p1, v2}, La/lnq;-><init>(La/gmq;IB)V

    .line 11
    .line 12
    .line 13
    new-instance v0, La/xn2;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v0, p0, p1, v2}, La/xn2;-><init>(La/nyu;ILa/yje;)V

    .line 17
    .line 18
    .line 19
    new-instance v3, La/vsg0;

    .line 20
    .line 21
    invoke-direct {v3, v0}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, La/myu;

    .line 25
    .line 26
    invoke-direct {v0, p0, p1, v2}, La/myu;-><init>(La/nyu;ILa/yje;)V

    .line 27
    .line 28
    .line 29
    new-instance p0, La/p6d;

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    invoke-direct {p0, v1, v3, v0, p1}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 33
    .line 34
    .line 35
    return-object p0
.end method
