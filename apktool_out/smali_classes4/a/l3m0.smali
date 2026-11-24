.class public final synthetic La/l3m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/b110;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/b110;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/l3m0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/l3m0;->b:La/mm40;

    iput-object p2, p0, La/l3m0;->c:La/b110;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/b110;I)V
    .locals 0

    .line 2
    const/4 p3, 0x1

    iput-byte p3, p0, La/l3m0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/l3m0;->b:La/mm40;

    iput-object p2, p0, La/l3m0;->c:La/b110;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/l3m0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/l3m0;->c:La/b110;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/fet;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Integer;

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
    iget-object p0, p0, La/l3m0;->b:La/mm40;

    .line 21
    .line 22
    invoke-static {p0, v2, p1, p2}, La/r3m0;->h(La/mm40;La/b110;La/fet;I)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    move-object v4, p1

    .line 29
    check-cast v4, La/fet;

    .line 30
    .line 31
    check-cast p2, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    and-int/lit8 p2, p1, 0x3

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    if-eq p2, v0, :cond_0

    .line 41
    .line 42
    move p2, v1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 p2, 0x0

    .line 45
    :goto_0
    and-int/2addr p1, v1

    .line 46
    invoke-virtual {v4, p1, p2}, La/fet;->U(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    new-instance p1, La/un6;

    .line 53
    .line 54
    const/4 p2, 0x3

    .line 55
    invoke-direct {p1, v2, p2}, La/un6;-><init>(Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    const p2, -0x4fb54746

    .line 59
    .line 60
    .line 61
    invoke-static {p2, p1, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    const/16 v5, 0xc00

    .line 66
    .line 67
    const/4 v6, 0x6

    .line 68
    iget-object v0, p0, La/l3m0;->b:La/mm40;

    .line 69
    .line 70
    const/4 v1, 0x0

    .line 71
    const/4 v2, 0x0

    .line 72
    invoke-static/range {v0 .. v6}, La/nnw0;->g(La/mm40;La/u12;ZLa/ugd;La/fet;II)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-virtual {v4}, La/fet;->X()V

    .line 77
    .line 78
    .line 79
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
