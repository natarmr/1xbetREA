.class public final synthetic La/wx20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dy20;


# direct methods
.method public synthetic constructor <init>(La/dy20;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wx20;->a:B

    iput-object p1, p0, La/wx20;->b:La/dy20;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/wx20;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/wx20;->b:La/dy20;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-virtual {p0, v0}, La/dy20;->y(Z)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    iget-object v0, p0, La/dy20;->g:La/g2v;

    .line 16
    .line 17
    sget-object v1, La/pb10;->g:La/pb10;

    .line 18
    .line 19
    new-instance v6, La/wx20;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    invoke-direct {v6, p0, v2}, La/wx20;-><init>(La/dy20;B)V

    .line 23
    .line 24
    .line 25
    const/16 v7, 0x5e

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    const v4, 0x7f130677

    .line 30
    .line 31
    .line 32
    const v5, 0x7f131690

    .line 33
    .line 34
    .line 35
    invoke-static/range {v0 .. v7}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    iget-object v0, p0, La/dy20;->g:La/g2v;

    .line 41
    .line 42
    sget-object v1, La/pb10;->g:La/pb10;

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    const/16 v7, 0x1de

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    const/4 v3, 0x0

    .line 49
    const v4, 0x7f13138d

    .line 50
    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    invoke-static/range {v0 .. v7}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :pswitch_2
    iget-object p0, p0, La/dy20;->d:La/pru;

    .line 59
    .line 60
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
