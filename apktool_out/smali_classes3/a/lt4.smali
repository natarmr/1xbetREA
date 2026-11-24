.class public final synthetic La/lt4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ku4;


# direct methods
.method public synthetic constructor <init>(La/ku4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lt4;->a:B

    iput-object p1, p0, La/lt4;->b:La/ku4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/lt4;->a:B

    .line 2
    .line 3
    sget-object v1, La/ut4;->a:La/ut4;

    .line 4
    .line 5
    iget-object v2, p0, La/lt4;->b:La/ku4;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2, v1}, La/ku4;->G(La/xt4;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    iget-object v2, p0, La/lt4;->b:La/ku4;

    .line 17
    .line 18
    iget-object p0, v2, La/ku4;->t:La/g2v;

    .line 19
    .line 20
    sget-object v8, La/pb10;->g:La/pb10;

    .line 21
    .line 22
    new-instance v0, La/f8;

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    const/16 v7, 0x19

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    const-class v3, La/ku4;

    .line 29
    .line 30
    const-string v4, "buttonTryAgainClick"

    .line 31
    .line 32
    const-string v5, "buttonTryAgainClick()V"

    .line 33
    .line 34
    invoke-direct/range {v0 .. v7}, La/f8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 35
    .line 36
    .line 37
    const/16 v10, 0x5e

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    const v7, 0x7f130677

    .line 42
    .line 43
    .line 44
    move-object v4, v8

    .line 45
    const v8, 0x7f131690

    .line 46
    .line 47
    .line 48
    move-object v3, p0

    .line 49
    move-object v9, v0

    .line 50
    invoke-static/range {v3 .. v10}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :pswitch_1
    invoke-virtual {v2, v1}, La/ku4;->G(La/xt4;)V

    .line 56
    .line 57
    .line 58
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_2
    invoke-virtual {v2, v1}, La/ku4;->G(La/xt4;)V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
