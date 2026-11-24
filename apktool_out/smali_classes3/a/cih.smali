.class public final La/cih;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/q7d0;


# direct methods
.method public constructor <init>(La/q7d0;B)V
    .locals 0

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/cih;->a:La/q7d0;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/cih;->a:La/q7d0;

    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La/cih;->a:La/q7d0;

    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a()La/uzc;
    .locals 1

    .line 1
    new-instance v0, La/uzc;

    .line 2
    .line 3
    iget-object p0, p0, La/cih;->a:La/q7d0;

    .line 4
    .line 5
    invoke-direct {v0, p0}, La/uzc;-><init>(La/q7d0;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public b()La/zyt;
    .locals 1

    .line 1
    new-instance v0, La/zyt;

    .line 2
    .line 3
    invoke-virtual {p0}, La/cih;->a()La/uzc;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, La/zyt;-><init>(La/uzc;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public c()La/k7u;
    .locals 1

    .line 1
    new-instance v0, La/k7u;

    .line 2
    .line 3
    invoke-virtual {p0}, La/cih;->a()La/uzc;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, La/k7u;-><init>(La/uzc;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public d()La/zyt;
    .locals 1

    .line 1
    new-instance v0, La/zyt;

    .line 2
    .line 3
    invoke-virtual {p0}, La/cih;->a()La/uzc;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, La/zyt;-><init>(La/uzc;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
