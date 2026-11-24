.class public final synthetic La/ww80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function2;

.field public final synthetic c:La/zw80;


# direct methods
.method public synthetic constructor <init>(La/zw80;Lkotlin/jvm/functions/Function2;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/ww80;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ww80;->c:La/zw80;

    iput-object p2, p0, La/ww80;->b:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;La/zw80;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/ww80;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ww80;->b:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, La/ww80;->c:La/zw80;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/ww80;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ww80;->c:La/zw80;

    .line 4
    .line 5
    iget-object p0, p0, La/ww80;->b:Lkotlin/jvm/functions/Function2;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Long;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast v1, La/xw80;

    .line 16
    .line 17
    iget-object v0, v1, La/xw80;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-interface {p0, v0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    move-object v0, p1

    .line 26
    check-cast v0, La/hcz;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-object p1, v1

    .line 32
    check-cast p1, La/xw80;

    .line 33
    .line 34
    iget-object p1, p1, La/xw80;->c:La/a4x;

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    new-instance v2, La/d2s;

    .line 41
    .line 42
    const/16 v3, 0x12

    .line 43
    .line 44
    invoke-direct {v2, v1, p0, v3}, La/d2s;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 45
    .line 46
    .line 47
    new-instance v4, La/ugd;

    .line 48
    .line 49
    const p0, 0x5cf9ba34

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    invoke-direct {v4, p0, v1, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    const/4 v5, 0x6

    .line 57
    const/4 v2, 0x0

    .line 58
    const/4 v3, 0x0

    .line 59
    move v1, p1

    .line 60
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
