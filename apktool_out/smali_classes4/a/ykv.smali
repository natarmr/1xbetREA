.class public final synthetic La/ykv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/alv;


# direct methods
.method public synthetic constructor <init>(La/alv;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ykv;->a:B

    iput-object p1, p0, La/ykv;->b:La/alv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/ykv;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ykv;->b:La/alv;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/alv;->f:La/v88;

    .line 9
    .line 10
    iget-object p0, p0, La/alv;->g:La/i1w0;

    .line 11
    .line 12
    const-wide/16 v1, 0x0

    .line 13
    .line 14
    const/4 v3, 0x4

    .line 15
    invoke-static {v0, p0, v1, v2, v3}, La/v88;->b(La/v88;La/i1w0;JI)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    iget-object v0, p0, La/alv;->g:La/i1w0;

    .line 22
    .line 23
    new-instance v1, La/k0w0;

    .line 24
    .line 25
    invoke-direct {v1, v0}, La/k0w0;-><init>(La/i1w0;)V

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, La/alv;->h:La/oct;

    .line 29
    .line 30
    const/4 v8, 0x0

    .line 31
    const/16 v9, 0x1f

    .line 32
    .line 33
    const-wide/16 v3, 0x0

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    invoke-static/range {v2 .. v9}, La/oct;->f(La/oct;JLa/d270;ILa/t270;Ljava/lang/String;I)Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 43
    .line 44
    .line 45
    iget-object v1, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-static {v0, v1, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :goto_0
    move-object v2, v1

    .line 53
    check-cast v2, La/paw;

    .line 54
    .line 55
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_0

    .line 60
    .line 61
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, La/oe50;

    .line 66
    .line 67
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    sget-object v0, La/rkv;->g:La/rkv;

    .line 72
    .line 73
    invoke-virtual {p0, v0}, La/alv;->v(La/rkv;)V

    .line 74
    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
