.class public final synthetic La/n7h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r9u;

.field public final synthetic c:La/ctf0;


# direct methods
.method public synthetic constructor <init>(La/ctf0;La/r9u;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/n7h;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/n7h;->c:La/ctf0;

    iput-object p2, p0, La/n7h;->b:La/r9u;

    return-void
.end method

.method public synthetic constructor <init>(La/r9u;La/ctf0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/n7h;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/n7h;->b:La/r9u;

    iput-object p2, p0, La/n7h;->c:La/ctf0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/n7h;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/n7h;->c:La/ctf0;

    .line 4
    .line 5
    iget-object p0, p0, La/n7h;->b:La/r9u;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/ohx;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object v0, La/ygp;->c:La/ygp;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, La/r9u;->a:La/j1q0;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, La/m1q0;->d(La/ygp;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    sget-object v2, La/ygp;->o1:La/ygp;

    .line 32
    .line 33
    invoke-virtual {p0, v2}, La/m1q0;->d(La/ygp;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    new-instance v2, La/thx;

    .line 38
    .line 39
    invoke-direct {v2, p1, v0, v1, p0}, La/thx;-><init>(La/ohx;ZLa/ctf0;Z)V

    .line 40
    .line 41
    .line 42
    return-object v2

    .line 43
    :pswitch_0
    check-cast p1, La/g7h;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance p1, La/l7h;

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    new-array v2, v0, [Ljava/lang/Object;

    .line 52
    .line 53
    iget-object v3, v1, La/ctf0;->b:La/lsm0;

    .line 54
    .line 55
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const v2, 0x7f130c89

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v2, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sget-object v2, La/ygp;->t:La/ygp;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-object p0, p0, La/r9u;->a:La/j1q0;

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 77
    .line 78
    invoke-virtual {p0, v2}, La/m1q0;->d(La/ygp;)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    invoke-direct {p1, v1, v0, p0}, La/l7h;-><init>(La/ctf0;Ljava/lang/String;Z)V

    .line 83
    .line 84
    .line 85
    return-object p1

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
