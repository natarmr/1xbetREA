.class public final synthetic La/guh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zuh0;


# direct methods
.method public synthetic constructor <init>(La/zuh0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/guh0;->a:B

    iput-object p1, p0, La/guh0;->b:La/zuh0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/guh0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/guh0;->b:La/zuh0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/zuh0;->x()V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_0
    iget-object v0, p0, La/zuh0;->r:La/g2v;

    .line 15
    .line 16
    sget-object v1, La/pb10;->g:La/pb10;

    .line 17
    .line 18
    new-instance v6, La/guh0;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-direct {v6, p0, v2}, La/guh0;-><init>(La/zuh0;B)V

    .line 22
    .line 23
    .line 24
    const/16 v7, 0x5e

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    const v4, 0x7f130677

    .line 29
    .line 30
    .line 31
    const v5, 0x7f131690

    .line 32
    .line 33
    .line 34
    invoke-static/range {v0 .. v7}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
