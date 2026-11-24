.class public final synthetic La/p4s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/s4s;

.field public final synthetic c:La/o0x;

.field public final synthetic d:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/s4s;La/o0x;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/p4s;->a:B

    iput-object p1, p0, La/p4s;->b:La/s4s;

    iput-object p2, p0, La/p4s;->c:La/o0x;

    iput-object p3, p0, La/p4s;->d:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/p4s;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/p4s;->d:Lkotlin/jvm/functions/Function2;

    .line 5
    .line 6
    iget-object v3, p0, La/p4s;->c:La/o0x;

    .line 7
    .line 8
    iget-object p0, p0, La/p4s;->b:La/s4s;

    .line 9
    .line 10
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    instance-of v0, v3, La/n0x;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    check-cast v3, La/n0x;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v3, v1

    .line 26
    :goto_0
    if-eqz v3, :cond_1

    .line 27
    .line 28
    iget-object v1, v3, La/n0x;->a:Ljava/lang/String;

    .line 29
    .line 30
    :cond_1
    iput-object v1, p0, La/s4s;->g:Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {v2, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    instance-of v0, v3, La/n0x;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    check-cast v3, La/n0x;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move-object v3, v1

    .line 53
    :goto_1
    if-eqz v3, :cond_3

    .line 54
    .line 55
    iget-object v1, v3, La/n0x;->a:Ljava/lang/String;

    .line 56
    .line 57
    :cond_3
    iput-object v1, p0, La/s4s;->g:Ljava/lang/String;

    .line 58
    .line 59
    invoke-interface {v2, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
