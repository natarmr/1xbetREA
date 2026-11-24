.class public final synthetic La/kep;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/favorites/impl/presentation/category/f;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/favorites/impl/presentation/category/f;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kep;->a:B

    iput-object p1, p0, La/kep;->b:Lorg/xplatform/favorites/impl/presentation/category/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/kep;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/kep;->b:Lorg/xplatform/favorites/impl/presentation/category/f;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lorg/xplatform/favorites/impl/presentation/category/f;->w()V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_0
    iget-object v0, p0, Lorg/xplatform/favorites/impl/presentation/category/f;->j:La/g2v;

    .line 15
    .line 16
    sget-object v1, La/pb10;->g:La/pb10;

    .line 17
    .line 18
    new-instance v6, La/kep;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v6, p0, v2}, La/kep;-><init>(Lorg/xplatform/favorites/impl/presentation/category/f;B)V

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
    const v4, 0x7f1307c4

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
    :pswitch_1
    iget-object v0, p0, Lorg/xplatform/favorites/impl/presentation/category/f;->j:La/g2v;

    .line 40
    .line 41
    sget-object v1, La/pb10;->e:La/pb10;

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    const/16 v7, 0x1de

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    const/4 v3, 0x0

    .line 48
    const v4, 0x7f130e37

    .line 49
    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    invoke-static/range {v0 .. v7}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
