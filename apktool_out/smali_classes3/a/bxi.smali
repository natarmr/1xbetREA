.class public final La/bxi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/us3;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/bxi;->a:B

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, La/bxi;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/us3;La/us00;La/q7d0;La/vby;)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    iput-byte p2, p0, La/bxi;->a:B

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance p2, La/bxi;

    .line 17
    .line 18
    invoke-direct {p2, p1}, La/bxi;-><init>(La/us3;)V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, La/bxi;->b:Ljava/lang/Object;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a()La/epi0;
    .locals 4

    .line 1
    iget-byte v0, p0, La/bxi;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/bxi;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/bxi;

    .line 9
    .line 10
    invoke-virtual {p0}, La/bxi;->a()La/epi0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    new-instance v0, La/epi0;

    .line 16
    .line 17
    new-instance v1, La/j6m0;

    .line 18
    .line 19
    new-instance v2, La/y2m0;

    .line 20
    .line 21
    const/16 v3, 0x12

    .line 22
    .line 23
    invoke-direct {v2, v3}, La/y2m0;-><init>(B)V

    .line 24
    .line 25
    .line 26
    new-instance v3, La/s2m0;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    check-cast p0, La/us3;

    .line 32
    .line 33
    invoke-direct {v1, v2, v3, p0}, La/j6m0;-><init>(La/y2m0;La/s2m0;La/us3;)V

    .line 34
    .line 35
    .line 36
    const/16 p0, 0xb

    .line 37
    .line 38
    invoke-direct {v0, v1, p0}, La/epi0;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
