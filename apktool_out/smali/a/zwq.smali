.class public final La/zwq;
.super La/dxq;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroidx/fragment/app/Fragment;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/Fragment;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zwq;->a:B

    iput-object p1, p0, La/zwq;->b:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-byte v0, p0, La/zwq;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/zwq;->b:Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v1:La/fbv;

    .line 9
    .line 10
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->w:La/jxq;

    .line 11
    .line 12
    iget-object p0, p0, La/jxq;->b:Landroid/content/Context;

    .line 13
    .line 14
    iput-object p0, v0, La/fbv;->b:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v0, v0, La/fbv;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, La/bh60;

    .line 35
    .line 36
    invoke-interface {v1, p0}, La/bh60;->a(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void

    .line 41
    :pswitch_0
    iget-object p0, p0, La/zwq;->b:Landroidx/fragment/app/Fragment;

    .line 42
    .line 43
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->z1:La/nw20;

    .line 44
    .line 45
    iget-object v0, v0, La/nw20;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, La/h0h0;

    .line 48
    .line 49
    invoke-virtual {v0}, La/h0h0;->a()V

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, La/zzg0;->b(La/i0h0;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->b:Landroid/os/Bundle;

    .line 56
    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    const-string v1, "registryState"

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    const/4 v0, 0x0

    .line 67
    :goto_1
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->z1:La/nw20;

    .line 68
    .line 69
    invoke-virtual {p0, v0}, La/nw20;->p(Landroid/os/Bundle;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
