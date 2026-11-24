.class public final synthetic La/j02;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/m02;

.field public final synthetic d:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/m02;Landroid/content/Context;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/j02;->a:B

    iput-object p1, p0, La/j02;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/j02;->c:La/m02;

    iput-object p3, p0, La/j02;->d:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/j02;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/j02;->d:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, La/j02;->c:La/m02;

    .line 6
    .line 7
    iget-object p0, p0, La/j02;->b:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, La/m8f0;

    .line 13
    .line 14
    iget-object v2, v2, La/m02;->a:La/u0f0;

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v2, v1}, La/m8f0;-><init>(La/u0f0;Ljava/io/File;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_0
    sget-object v0, La/ymx;->g:La/ymx;

    .line 33
    .line 34
    new-instance v3, La/j02;

    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    invoke-direct {v3, p0, v2, v1, v4}, La/j02;-><init>(Lkotlin/jvm/functions/Function1;La/m02;Landroid/content/Context;B)V

    .line 38
    .line 39
    .line 40
    new-instance p0, La/bjj;

    .line 41
    .line 42
    invoke-direct {p0, v0, v4, v3}, La/bjj;-><init>(La/ymx;ZLkotlin/jvm/functions/Function0;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, La/bjj;->a()V

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
