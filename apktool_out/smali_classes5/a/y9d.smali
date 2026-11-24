.class public final synthetic La/y9d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/h9d;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/h9d;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/y9d;->a:B

    iput-object p1, p0, La/y9d;->b:La/mm40;

    iput-object p2, p0, La/y9d;->c:La/h9d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/y9d;->a:B

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, La/y9d;->c:La/h9d;

    .line 8
    .line 9
    iget-object p0, p0, La/y9d;->b:La/mm40;

    .line 10
    .line 11
    check-cast p1, La/yhg0;

    .line 12
    .line 13
    check-cast p2, La/fet;

    .line 14
    .line 15
    check-cast p3, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    and-int/lit8 p1, p3, 0x11

    .line 28
    .line 29
    if-eq p1, v1, :cond_0

    .line 30
    .line 31
    move p1, v3

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move p1, v2

    .line 34
    :goto_0
    and-int/2addr p3, v3

    .line 35
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    iget-object p1, v4, La/h9d;->d:La/k9d;

    .line 42
    .line 43
    iget p1, p1, La/k9d;->a:F

    .line 44
    .line 45
    invoke-static {p0, p1}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    iget-object p1, v4, La/h9d;->d:La/k9d;

    .line 50
    .line 51
    invoke-virtual {p1}, La/k9d;->a()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {v2, v2, p2, p0, p1}, La/x2x;->u(IILa/fet;La/mm40;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-virtual {p2}, La/fet;->X()V

    .line 60
    .line 61
    .line 62
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    and-int/lit8 p1, p3, 0x11

    .line 69
    .line 70
    if-eq p1, v1, :cond_2

    .line 71
    .line 72
    move p1, v3

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    move p1, v2

    .line 75
    :goto_2
    and-int/2addr p3, v3

    .line 76
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    iget-object p1, v4, La/h9d;->c:La/j9d;

    .line 83
    .line 84
    iget p1, p1, La/k9d;->a:F

    .line 85
    .line 86
    invoke-static {p0, p1}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    iget-object p1, v4, La/h9d;->c:La/j9d;

    .line 91
    .line 92
    iget-object p1, p1, La/j9d;->b:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v2, v2, p2, p0, p1}, La/x2x;->u(IILa/fet;La/mm40;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 99
    .line 100
    .line 101
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
