.class public final synthetic La/ibh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/lbh0;


# direct methods
.method public synthetic constructor <init>(La/lbh0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ibh0;->a:B

    iput-object p1, p0, La/ibh0;->b:La/lbh0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/ibh0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ibh0;->b:La/lbh0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/lbh0;->u1:La/nqq;

    .line 9
    .line 10
    move-object v0, p0

    .line 11
    check-cast v0, La/lm40;

    .line 12
    .line 13
    iget-object v0, v0, La/lm40;->a:La/lm40;

    .line 14
    .line 15
    iget-boolean v0, v0, La/lm40;->n:Z

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p0}, La/nqq;->e1()La/iqq;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, La/iqq;->a()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0}, La/iqq;->b()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0, v1}, La/nqq;->c1(La/j6z;)La/jge0;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static {p0}, La/vcc;->a0(La/yzj;)La/cg80;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v0}, La/cg80;->getFocusOwner()La/wpq;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, La/ypq;

    .line 52
    .line 53
    invoke-virtual {v0}, La/ypq;->h()La/nqq;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-static {p0}, La/vcc;->Y(La/yzj;)La/s460;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {v0, p0}, La/nqq;->c1(La/j6z;)La/jge0;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    :cond_3
    :goto_0
    return-object v1

    .line 68
    :pswitch_0
    iget-boolean p0, p0, La/lm40;->n:Z

    .line 69
    .line 70
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
