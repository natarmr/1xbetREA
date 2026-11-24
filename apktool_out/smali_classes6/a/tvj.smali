.class public final La/tvj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/qvj;


# instance fields
.field public final synthetic a:B

.field public final b:Lkotlin/jvm/functions/Function2;

.field public final c:Lkotlin/jvm/functions/Function2;

.field public final d:Lkotlin/jvm/functions/Function2;

.field public final e:Lkotlin/jvm/functions/Function2;

.field public final f:Lkotlin/jvm/functions/Function2;

.field public final g:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;)V
    .locals 6

    const/4 v0, 0x0

    iput-byte v0, p0, La/tvj;->a:B

    .line 71
    new-instance v0, La/zuh;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, La/zuh;-><init>(B)V

    .line 72
    new-instance v1, La/zuh;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, La/zuh;-><init>(B)V

    .line 73
    new-instance v2, La/zuh;

    const/16 v3, 0x1b

    invoke-direct {v2, v3}, La/zuh;-><init>(B)V

    .line 74
    new-instance v3, La/zuh;

    const/16 v4, 0x1d

    invoke-direct {v3, v4}, La/zuh;-><init>(B)V

    .line 75
    new-instance v4, La/svj;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, La/svj;-><init>(B)V

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object v0, p0, La/tvj;->b:Lkotlin/jvm/functions/Function2;

    .line 78
    iput-object v1, p0, La/tvj;->c:Lkotlin/jvm/functions/Function2;

    .line 79
    iput-object v2, p0, La/tvj;->d:Lkotlin/jvm/functions/Function2;

    .line 80
    iput-object v3, p0, La/tvj;->e:Lkotlin/jvm/functions/Function2;

    .line 81
    iput-object v4, p0, La/tvj;->f:Lkotlin/jvm/functions/Function2;

    .line 82
    iput-object p1, p0, La/tvj;->g:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/tvj;->a:B

    .line 3
    .line 4
    new-instance v0, La/zuh;

    .line 5
    .line 6
    const/16 v1, 0x18

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/zuh;-><init>(B)V

    .line 9
    .line 10
    .line 11
    new-instance v1, La/zuh;

    .line 12
    .line 13
    const/16 v2, 0x1a

    .line 14
    .line 15
    invoke-direct {v1, v2}, La/zuh;-><init>(B)V

    .line 16
    .line 17
    .line 18
    and-int/lit8 v2, p4, 0x4

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    new-instance p1, La/zuh;

    .line 23
    .line 24
    const/16 v2, 0x1c

    .line 25
    .line 26
    invoke-direct {p1, v2}, La/zuh;-><init>(B)V

    .line 27
    .line 28
    .line 29
    :cond_0
    and-int/lit8 v2, p4, 0x8

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    new-instance p2, La/svj;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-direct {p2, v2}, La/svj;-><init>(B)V

    .line 37
    .line 38
    .line 39
    :cond_1
    new-instance v2, La/svj;

    .line 40
    .line 41
    const/4 v3, 0x2

    .line 42
    invoke-direct {v2, v3}, La/svj;-><init>(B)V

    .line 43
    .line 44
    .line 45
    and-int/lit8 p4, p4, 0x20

    .line 46
    .line 47
    if-eqz p4, :cond_2

    .line 48
    .line 49
    new-instance p3, La/svj;

    .line 50
    .line 51
    const/4 p4, 0x3

    .line 52
    invoke-direct {p3, p4}, La/svj;-><init>(B)V

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, La/tvj;->b:Lkotlin/jvm/functions/Function2;

    .line 59
    .line 60
    iput-object v1, p0, La/tvj;->c:Lkotlin/jvm/functions/Function2;

    .line 61
    .line 62
    iput-object p1, p0, La/tvj;->d:Lkotlin/jvm/functions/Function2;

    .line 63
    .line 64
    iput-object p2, p0, La/tvj;->e:Lkotlin/jvm/functions/Function2;

    .line 65
    .line 66
    iput-object v2, p0, La/tvj;->f:Lkotlin/jvm/functions/Function2;

    .line 67
    .line 68
    iput-object p3, p0, La/tvj;->g:Lkotlin/jvm/functions/Function2;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final onCreate(La/clz;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/tvj;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/tvj;->b:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-interface {v1, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-interface {v1, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onDestroy(La/clz;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/tvj;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/tvj;->g:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-interface {v1, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-interface {v1, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onPause(La/clz;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/tvj;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/tvj;->e:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-interface {v1, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-interface {v1, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onResume(La/clz;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/tvj;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/tvj;->d:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-interface {v1, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-interface {v1, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onStart(La/clz;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/tvj;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/tvj;->c:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-interface {v1, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-interface {v1, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onStop(La/clz;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/tvj;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/tvj;->f:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-interface {v1, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-interface {v1, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
