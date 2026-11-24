.class public final synthetic La/icb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r4b0;

.field public final synthetic c:La/cp;


# direct methods
.method public synthetic constructor <init>(La/r4b0;La/cp;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/icb;->a:B

    iput-object p1, p0, La/icb;->b:La/r4b0;

    iput-object p2, p0, La/icb;->c:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-byte p1, p0, La/icb;->a:B

    .line 2
    .line 3
    iget-object v0, p0, La/icb;->c:La/cp;

    .line 4
    .line 5
    iget-object p0, p0, La/icb;->b:La/r4b0;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, La/zgb;

    .line 15
    .line 16
    iget-object v0, p0, La/r4b0;->c:La/i1w0;

    .line 17
    .line 18
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v2, La/qw80;

    .line 23
    .line 24
    const/16 v3, 0x1a

    .line 25
    .line 26
    invoke-direct {v2, p0, p1, v3}, La/qw80;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    new-instance p0, La/a1w0;

    .line 30
    .line 31
    invoke-direct {p0, v2}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 32
    .line 33
    .line 34
    new-instance p1, La/c8d;

    .line 35
    .line 36
    sget-object v2, La/y7d;->a:La/v7d;

    .line 37
    .line 38
    invoke-direct {p1, v2, p0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    invoke-static {v1, p1, v0, v1, p0}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    :goto_0
    move-object p1, p0

    .line 47
    check-cast p1, La/paw;

    .line 48
    .line 49
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_0

    .line 54
    .line 55
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, La/oe50;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, La/i1w0;->a(La/oe50;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    return-void

    .line 66
    :pswitch_0
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, La/fcb;

    .line 71
    .line 72
    iget-wide v0, p1, La/fcb;->a:J

    .line 73
    .line 74
    invoke-virtual {p0, v0, v1}, La/r4b0;->x(J)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
