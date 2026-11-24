.class public final synthetic La/tk30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zk30;


# direct methods
.method public synthetic constructor <init>(La/zk30;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/tk30;->a:B

    iput-object p1, p0, La/tk30;->b:La/zk30;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/tk30;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/tk30;->b:La/zk30;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v1}, La/zk30;->w(Z)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    invoke-virtual {p0, v1}, La/zk30;->w(Z)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_1
    iget-object v0, p0, La/zk30;->i:La/g2v;

    .line 22
    .line 23
    sget-object v1, La/pb10;->g:La/pb10;

    .line 24
    .line 25
    new-instance v6, La/tk30;

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    invoke-direct {v6, p0, v2}, La/tk30;-><init>(La/zk30;B)V

    .line 29
    .line 30
    .line 31
    const/16 v7, 0x5e

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x0

    .line 35
    const v4, 0x7f1305c0

    .line 36
    .line 37
    .line 38
    const v5, 0x7f131111

    .line 39
    .line 40
    .line 41
    invoke-static/range {v0 .. v7}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :pswitch_2
    iget-object v0, p0, La/zk30;->i:La/g2v;

    .line 47
    .line 48
    sget-object v1, La/pb10;->g:La/pb10;

    .line 49
    .line 50
    new-instance v6, La/tk30;

    .line 51
    .line 52
    const/4 v2, 0x3

    .line 53
    invoke-direct {v6, p0, v2}, La/tk30;-><init>(La/zk30;B)V

    .line 54
    .line 55
    .line 56
    const/16 v7, 0x5e

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    const/4 v3, 0x0

    .line 60
    const v4, 0x7f130677

    .line 61
    .line 62
    .line 63
    const v5, 0x7f131690

    .line 64
    .line 65
    .line 66
    invoke-static/range {v0 .. v7}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
