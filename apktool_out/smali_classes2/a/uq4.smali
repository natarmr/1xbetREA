.class public final synthetic La/uq4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hl60;


# direct methods
.method public synthetic constructor <init>(La/hl60;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/uq4;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/uq4;->b:La/hl60;

    return-void
.end method

.method public synthetic constructor <init>(La/hl60;I)V
    .locals 0

    .line 2
    const/4 p2, 0x1

    iput-byte p2, p0, La/uq4;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/uq4;->b:La/hl60;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/uq4;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/uq4;->b:La/hl60;

    .line 4
    .line 5
    check-cast p1, La/fet;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/Integer;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/16 p2, 0x9

    .line 16
    .line 17
    invoke-static {p2}, La/x8x;->L(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-static {p0, p1, p2}, La/cjx;->f(La/hl60;La/fet;I)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    and-int/lit8 v0, p2, 0x3

    .line 32
    .line 33
    const/4 v1, 0x2

    .line 34
    const/4 v2, 0x1

    .line 35
    const/4 v3, 0x0

    .line 36
    if-eq v0, v1, :cond_0

    .line 37
    .line 38
    move v0, v2

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v0, v3

    .line 41
    :goto_0
    and-int/2addr p2, v2

    .line 42
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-eqz p2, :cond_3

    .line 47
    .line 48
    const p2, 0x7f130181

    .line 49
    .line 50
    .line 51
    invoke-static {p2, p1}, La/xsm0;->s(ILa/fet;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    if-nez v0, :cond_1

    .line 64
    .line 65
    sget-object v0, La/ukd;->a:La/cl5;

    .line 66
    .line 67
    if-ne v2, v0, :cond_2

    .line 68
    .line 69
    :cond_1
    new-instance v2, La/zo4;

    .line 70
    .line 71
    invoke-direct {v2, p0, v1}, La/zo4;-><init>(Ljava/lang/Object;B)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 78
    .line 79
    invoke-static {p2, v2, p1, v3}, La/jeb;->i(Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 84
    .line 85
    .line 86
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
