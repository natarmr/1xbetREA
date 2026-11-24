.class public final La/kwe0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cqq;

.field public final synthetic c:La/wpq;

.field public final synthetic d:La/pkk0;


# direct methods
.method public synthetic constructor <init>(La/cqq;La/wpq;La/pkk0;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/kwe0;->a:B

    iput-object p1, p0, La/kwe0;->b:La/cqq;

    iput-object p2, p0, La/kwe0;->c:La/wpq;

    iput-object p3, p0, La/kwe0;->d:La/pkk0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte p2, p0, La/kwe0;->a:B

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object v1, p0, La/kwe0;->d:La/pkk0;

    .line 5
    .line 6
    iget-object v2, p0, La/kwe0;->c:La/wpq;

    .line 7
    .line 8
    iget-object p0, p0, La/kwe0;->b:La/cqq;

    .line 9
    .line 10
    packed-switch p2, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, La/cqq;->a(La/cqq;)V

    .line 19
    .line 20
    .line 21
    check-cast v2, La/ypq;

    .line 22
    .line 23
    invoke-virtual {v2, v0}, La/ypq;->b(Z)V

    .line 24
    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    check-cast v1, La/r3k;

    .line 29
    .line 30
    invoke-virtual {v1}, La/r3k;->a()V

    .line 31
    .line 32
    .line 33
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {p0}, La/cqq;->a(La/cqq;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v2}, La/wpq;->a(La/wpq;)V

    .line 45
    .line 46
    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    check-cast v1, La/r3k;

    .line 50
    .line 51
    invoke-virtual {v1}, La/r3k;->a()V

    .line 52
    .line 53
    .line 54
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-static {p0}, La/cqq;->a(La/cqq;)V

    .line 63
    .line 64
    .line 65
    check-cast v2, La/ypq;

    .line 66
    .line 67
    invoke-virtual {v2, v0}, La/ypq;->b(Z)V

    .line 68
    .line 69
    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    check-cast v1, La/r3k;

    .line 73
    .line 74
    invoke-virtual {v1}, La/r3k;->a()V

    .line 75
    .line 76
    .line 77
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object p0

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
