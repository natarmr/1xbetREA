.class public final synthetic La/ibd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/l7m0;FFI)V
    .locals 0

    .line 2
    const/4 p5, 0x1

    iput-byte p5, p0, La/ibd;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ibd;->d:Ljava/lang/Object;

    iput-object p2, p0, La/ibd;->e:Ljava/lang/Object;

    iput p3, p0, La/ibd;->b:F

    iput p4, p0, La/ibd;->c:F

    return-void
.end method

.method public synthetic constructor <init>(La/ra00;FFLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/ibd;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ibd;->d:Ljava/lang/Object;

    iput p2, p0, La/ibd;->b:F

    iput p3, p0, La/ibd;->c:F

    iput-object p4, p0, La/ibd;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/ibd;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/ibd;->e:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v3, p0, La/ibd;->d:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object v4, v3

    .line 12
    check-cast v4, La/mm40;

    .line 13
    .line 14
    move-object v5, v2

    .line 15
    check-cast v5, La/l7m0;

    .line 16
    .line 17
    move-object v8, p1

    .line 18
    check-cast v8, La/fet;

    .line 19
    .line 20
    check-cast p2, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, La/x8x;->L(I)I

    .line 26
    .line 27
    .line 28
    move-result v9

    .line 29
    iget v6, p0, La/ibd;->b:F

    .line 30
    .line 31
    iget v7, p0, La/ibd;->c:F

    .line 32
    .line 33
    invoke-static/range {v4 .. v9}, La/jeb;->B(La/mm40;La/l7m0;FFLa/fet;I)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_0
    check-cast v3, La/ra00;

    .line 40
    .line 41
    move-object v7, v2

    .line 42
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 43
    .line 44
    move-object v8, p1

    .line 45
    check-cast v8, La/fet;

    .line 46
    .line 47
    check-cast p2, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    and-int/lit8 p2, p1, 0x3

    .line 54
    .line 55
    const/4 v0, 0x2

    .line 56
    if-eq p2, v0, :cond_0

    .line 57
    .line 58
    move p2, v1

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const/4 p2, 0x0

    .line 61
    :goto_0
    and-int/2addr p1, v1

    .line 62
    invoke-virtual {v8, p1, p2}, La/fet;->U(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_1

    .line 67
    .line 68
    move-object v4, v3

    .line 69
    check-cast v4, La/qa00;

    .line 70
    .line 71
    const/4 v9, 0x0

    .line 72
    iget v5, p0, La/ibd;->b:F

    .line 73
    .line 74
    iget v6, p0, La/ibd;->c:F

    .line 75
    .line 76
    invoke-static/range {v4 .. v9}, La/g8x;->s(La/qa00;FFLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    invoke-virtual {v8}, La/fet;->X()V

    .line 81
    .line 82
    .line 83
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
