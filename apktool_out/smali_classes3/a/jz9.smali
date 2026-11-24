.class public final synthetic La/jz9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qz9;


# direct methods
.method public synthetic constructor <init>(La/qz9;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jz9;->a:B

    iput-object p1, p0, La/jz9;->b:La/qz9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-byte v0, p0, La/jz9;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/jz9;->b:La/qz9;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/qz9;->k2:La/a8z;

    .line 9
    .line 10
    sget-object v1, La/qz9;->t2:La/kl5;

    .line 11
    .line 12
    :try_start_0
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, La/lyb0;

    .line 17
    .line 18
    iget-object v1, v1, La/lyb0;->a:La/rrd;

    .line 19
    .line 20
    invoke-virtual {v1}, La/rrd;->C()V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, La/lyb0;

    .line 28
    .line 29
    invoke-virtual {v0}, La/lyb0;->b()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p0}, La/qz9;->S0()La/d4a;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v0, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, La/d4a;->y(Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    invoke-virtual {p0}, La/qz9;->S0()La/d4a;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, La/d4a;->w()V

    .line 48
    .line 49
    .line 50
    :goto_0
    return-void

    .line 51
    :pswitch_0
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    invoke-virtual {p0, v0}, La/qz9;->V0(Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, La/qz9;->R0()La/rz9;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    iget-object p0, p0, La/rz9;->j:Landroidx/appcompat/widget/AppCompatImageView;

    .line 62
    .line 63
    const/high16 v0, 0x3f800000    # 1.0f

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
