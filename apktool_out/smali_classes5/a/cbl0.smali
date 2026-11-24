.class public final synthetic La/cbl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gbl0;


# direct methods
.method public synthetic constructor <init>(La/gbl0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/cbl0;->a:B

    iput-object p1, p0, La/cbl0;->b:La/gbl0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/cbl0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/cbl0;->b:La/gbl0;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/gbl0;->c2:La/lme0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/gbl0;->J0()La/ncl0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object v0, p0, La/ncl0;->i:La/i1w0;

    .line 20
    .line 21
    invoke-static {v0, v0}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v2, p0, La/ncl0;->k:La/yfm0;

    .line 26
    .line 27
    iget-object p0, p0, La/ncl0;->j:La/frs;

    .line 28
    .line 29
    iget-wide v3, p0, La/frs;->b:J

    .line 30
    .line 31
    check-cast v2, La/zfm0;

    .line 32
    .line 33
    invoke-virtual {v2, v3, v4, p1}, La/zfm0;->a(JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {v1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 38
    .line 39
    .line 40
    iget-object p0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    invoke-static {v0, p0, p1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    :goto_0
    move-object p1, p0

    .line 48
    check-cast p1, La/paw;

    .line 49
    .line 50
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_0

    .line 55
    .line 56
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, La/oe50;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, La/i1w0;->a(La/oe50;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_0
    sget-object v0, La/gbl0;->c2:La/lme0;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, La/gbl0;->J0()La/ncl0;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    iget-object v0, p0, La/ncl0;->i:La/i1w0;

    .line 79
    .line 80
    new-instance v1, La/u5l0;

    .line 81
    .line 82
    const/4 v2, 0x4

    .line 83
    invoke-direct {v1, p0, p1, v2}, La/u5l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 87
    .line 88
    .line 89
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
