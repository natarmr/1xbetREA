.class public final synthetic La/yts0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zts0;


# direct methods
.method public synthetic constructor <init>(La/zts0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/yts0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/yts0;->b:La/zts0;

    return-void
.end method

.method public synthetic constructor <init>(La/zts0;I)V
    .locals 0

    .line 2
    const/4 p2, 0x1

    iput-byte p2, p0, La/yts0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/yts0;->b:La/zts0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/yts0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/yts0;->b:La/zts0;

    .line 5
    .line 6
    check-cast p1, La/fet;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Integer;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, La/x8x;->L(I)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    invoke-static {p0, p1, p2}, La/mym0;->f(La/zts0;La/fet;I)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    and-int/lit8 v0, p2, 0x3

    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    const/4 v3, 0x0

    .line 34
    if-eq v0, v2, :cond_0

    .line 35
    .line 36
    move v0, v1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v0, v3

    .line 39
    :goto_0
    and-int/2addr p2, v1

    .line 40
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_1

    .line 45
    .line 46
    sget-object p2, La/qmk;->a:La/zcl;

    .line 47
    .line 48
    const/high16 p2, 0x42380000    # 46.0f

    .line 49
    .line 50
    sget-object v0, La/jm40;->b:La/jm40;

    .line 51
    .line 52
    invoke-static {v0, p2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    sget-object v0, La/gqw0;->n:La/xx7;

    .line 57
    .line 58
    new-instance v1, La/wkw;

    .line 59
    .line 60
    invoke-direct {v1, v0}, La/wkw;-><init>(La/xx7;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p2, v1}, La/mm40;->e(La/mm40;)La/mm40;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    iget-object v0, p0, La/zts0;->a:Ljava/lang/String;

    .line 68
    .line 69
    new-instance v1, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v2, "TWENTY_ONE_CARD_LIST_"

    .line 72
    .line 73
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {p2, v0}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    iget-object p0, p0, La/zts0;->c:Ljava/util/List;

    .line 88
    .line 89
    invoke-static {p2, p0, p1, v3}, La/mym0;->a(La/mm40;Ljava/util/List;La/fet;I)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    invoke-virtual {p1}, La/fet;->X()V

    .line 94
    .line 95
    .line 96
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
