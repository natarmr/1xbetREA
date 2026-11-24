.class public final synthetic La/l1b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/h2b;


# direct methods
.method public synthetic constructor <init>(La/h2b;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/l1b;->a:B

    iput-object p1, p0, La/l1b;->b:La/h2b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/l1b;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/l1b;->b:La/h2b;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/h2b;->U:La/ol60;

    .line 9
    .line 10
    sget-object v0, La/v1b;->a:La/v1b;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    iget-object v0, p0, La/h2b;->c:La/ouu;

    .line 19
    .line 20
    new-instance v1, La/bb50;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v1, v2}, La/bb50;-><init>(Z)V

    .line 24
    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    invoke-virtual {v0, v1, v3}, La/ouu;->q(La/cb50;Z)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, La/h2b;->b:La/i1w0;

    .line 31
    .line 32
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, La/c8d;

    .line 37
    .line 38
    sget-object v3, La/y7d;->a:La/v7d;

    .line 39
    .line 40
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 41
    .line 42
    invoke-direct {v1, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :goto_0
    move-object v1, v0

    .line 50
    check-cast v1, La/paw;

    .line 51
    .line 52
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_0

    .line 57
    .line 58
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, La/oe50;

    .line 63
    .line 64
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
