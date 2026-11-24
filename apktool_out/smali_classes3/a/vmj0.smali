.class public final synthetic La/vmj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cnj0;


# direct methods
.method public synthetic constructor <init>(La/cnj0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vmj0;->a:B

    iput-object p1, p0, La/vmj0;->b:La/cnj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-byte p1, p0, La/vmj0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/vmj0;->b:La/cnj0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p1, La/cnj0;->R1:La/gne0;

    .line 9
    .line 10
    iget-object p0, p0, La/cnj0;->Q1:La/n0o0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/qog0;

    .line 17
    .line 18
    invoke-virtual {p0}, La/qog0;->a()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    sget-object p1, La/cnj0;->R1:La/gne0;

    .line 23
    .line 24
    invoke-virtual {p0}, La/cnj0;->H0()La/hoj0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    iget-object p0, p0, La/hoj0;->j:La/i1w0;

    .line 29
    .line 30
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance v0, La/c8d;

    .line 35
    .line 36
    sget-object v1, La/y7d;->a:La/v7d;

    .line 37
    .line 38
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 39
    .line 40
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :goto_0
    move-object v0, p1

    .line 49
    check-cast v0, La/paw;

    .line 50
    .line 51
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, La/oe50;

    .line 62
    .line 63
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    return-void

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
