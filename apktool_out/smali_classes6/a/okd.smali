.class public final synthetic La/okd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cwk;

.field public final synthetic c:La/ugd;


# direct methods
.method public synthetic constructor <init>(La/cwk;La/ugd;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/okd;->a:B

    iput-object p1, p0, La/okd;->b:La/cwk;

    iput-object p2, p0, La/okd;->c:La/ugd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/okd;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    iget-object v3, p0, La/okd;->c:La/ugd;

    .line 6
    .line 7
    iget-object p0, p0, La/okd;->b:La/cwk;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    check-cast p1, La/fet;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    and-int/lit8 v0, p2, 0x3

    .line 22
    .line 23
    if-eq v0, v2, :cond_0

    .line 24
    .line 25
    move v1, v4

    .line 26
    :cond_0
    and-int/2addr p2, v4

    .line 27
    invoke-virtual {p1, p2, v1}, La/fet;->U(IZ)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    sget-object p2, La/jr00;->b:La/zfn;

    .line 34
    .line 35
    invoke-virtual {p2, p0}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    new-instance p2, La/w;

    .line 40
    .line 41
    const/4 v0, 0x5

    .line 42
    invoke-direct {p2, v3, v0}, La/w;-><init>(La/ugd;B)V

    .line 43
    .line 44
    .line 45
    const v0, 0x63ed8b07

    .line 46
    .line 47
    .line 48
    invoke-static {v0, p2, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    const/16 v0, 0x38

    .line 53
    .line 54
    invoke-static {p0, p2, p1, v0}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {p1}, La/fet;->X()V

    .line 59
    .line 60
    .line 61
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_0
    and-int/lit8 v0, p2, 0x3

    .line 65
    .line 66
    if-eq v0, v2, :cond_2

    .line 67
    .line 68
    move v1, v4

    .line 69
    :cond_2
    and-int/2addr p2, v4

    .line 70
    invoke-virtual {p1, p2, v1}, La/fet;->U(IZ)Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-eqz p2, :cond_3

    .line 75
    .line 76
    sget-object p2, La/s6t0;->a:La/pz40;

    .line 77
    .line 78
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {}, La/s6t0;->c()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    new-instance p2, La/okd;

    .line 87
    .line 88
    invoke-direct {p2, p0, v3, v4}, La/okd;-><init>(La/cwk;La/ugd;B)V

    .line 89
    .line 90
    .line 91
    const p0, 0x51c20647

    .line 92
    .line 93
    .line 94
    invoke-static {p0, p2, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    const/16 v4, 0x180

    .line 99
    .line 100
    const/4 v5, 0x0

    .line 101
    move-object v3, p1

    .line 102
    invoke-static/range {v0 .. v5}, La/dem0;->e(La/taq0;ZLa/ugd;La/fet;II)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    move-object v3, p1

    .line 107
    invoke-virtual {v3}, La/fet;->X()V

    .line 108
    .line 109
    .line 110
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object p0

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
