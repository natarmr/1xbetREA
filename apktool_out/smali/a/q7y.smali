.class public final synthetic La/q7y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZZB)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/q7y;->a:B

    iput-object p1, p0, La/q7y;->d:Ljava/lang/Object;

    iput-object p2, p0, La/q7y;->e:Ljava/lang/Object;

    iput-boolean p3, p0, La/q7y;->b:Z

    iput-boolean p4, p0, La/q7y;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget-byte v0, p0, La/q7y;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-boolean v2, p0, La/q7y;->c:Z

    .line 5
    .line 6
    iget-boolean v3, p0, La/q7y;->b:Z

    .line 7
    .line 8
    iget-object v4, p0, La/q7y;->e:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, La/q7y;->d:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, La/m9c;

    .line 16
    .line 17
    check-cast v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    invoke-virtual {v4, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, La/m9c;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, La/hcp0;

    .line 25
    .line 26
    invoke-virtual {p0, v3, v2}, La/hcp0;->v(ZZ)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    check-cast p0, Landroid/view/Window;

    .line 31
    .line 32
    check-cast v4, Landroid/view/View;

    .line 33
    .line 34
    if-eqz p0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    const v0, 0x7f040b22

    .line 46
    .line 47
    .line 48
    :goto_0
    move v7, v0

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    const v0, 0x7f040ae3

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :goto_1
    xor-int/lit8 v8, v3, 0x1

    .line 55
    .line 56
    if-nez v3, :cond_1

    .line 57
    .line 58
    if-nez v2, :cond_1

    .line 59
    .line 60
    const/4 v1, 0x1

    .line 61
    :cond_1
    move v9, v1

    .line 62
    const v6, 0x7f040b5d

    .line 63
    .line 64
    .line 65
    move-object v4, p0

    .line 66
    invoke-static/range {v4 .. v9}, La/ofm0;->y(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 67
    .line 68
    .line 69
    :cond_2
    return-void

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
