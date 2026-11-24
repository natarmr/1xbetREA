.class public final synthetic La/x3v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/c4v0;


# direct methods
.method public synthetic constructor <init>(La/c4v0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x3v0;->a:B

    iput-object p1, p0, La/x3v0;->b:La/c4v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/x3v0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/x3v0;->b:La/c4v0;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Throwable;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/c4v0;->g:La/p7m0;

    .line 14
    .line 15
    new-instance v1, La/a4v0;

    .line 16
    .line 17
    iget-object v2, p0, La/c4v0;->d:La/sa10;

    .line 18
    .line 19
    sget-object v3, La/pb10;->g:La/pb10;

    .line 20
    .line 21
    new-instance v6, La/rbt0;

    .line 22
    .line 23
    const/16 v4, 0x17

    .line 24
    .line 25
    invoke-direct {v6, p0, v4}, La/rbt0;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    const-wide/16 v7, 0x2710

    .line 29
    .line 30
    const v4, 0x7f130677

    .line 31
    .line 32
    .line 33
    const v5, 0x7f131690

    .line 34
    .line 35
    .line 36
    invoke-virtual/range {v2 .. v8}, La/sa10;->a(La/pb10;IILkotlin/jvm/functions/Function0;J)La/ra10;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-direct {v1, v2}, La/a4v0;-><init>(La/ra10;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-virtual {v0, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/c4v0;->f:La/duj;

    .line 51
    .line 52
    new-instance v0, La/b4u0;

    .line 53
    .line 54
    const/16 v1, 0x19

    .line 55
    .line 56
    invoke-direct {v0, v1}, La/b4u0;-><init>(B)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object p0, p0, La/c4v0;->f:La/duj;

    .line 69
    .line 70
    new-instance v0, La/b4u0;

    .line 71
    .line 72
    const/16 v1, 0x1a

    .line 73
    .line 74
    invoke-direct {v0, v1}, La/b4u0;-><init>(B)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 78
    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
