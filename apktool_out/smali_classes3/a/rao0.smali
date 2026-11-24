.class public final synthetic La/rao0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/sao0;


# direct methods
.method public synthetic constructor <init>(La/sao0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rao0;->a:B

    iput-object p1, p0, La/rao0;->b:La/sao0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/rao0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/rao0;->b:La/sao0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/sao0;->V1:La/m6m0;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, La/p270;

    .line 19
    .line 20
    invoke-direct {v2, p0, v0, v1}, La/p270;-><init>(La/sao0;La/kxq;Landroidx/fragment/app/e;)V

    .line 21
    .line 22
    .line 23
    return-object v2

    .line 24
    :pswitch_0
    sget-object v0, La/sao0;->V1:La/m6m0;

    .line 25
    .line 26
    iget-object v0, p0, La/sao0;->Q1:La/yzn0;

    .line 27
    .line 28
    sget-object v1, La/sao0;->W1:[La/iiy;

    .line 29
    .line 30
    const/4 v2, 0x2

    .line 31
    aget-object v1, v1, v2

    .line 32
    .line 33
    invoke-virtual {v0, p0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, La/cb50;

    .line 38
    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
