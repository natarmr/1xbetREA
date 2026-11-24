.class public final synthetic La/j3i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/b4i;

.field public final synthetic d:La/u3i;

.field public final synthetic e:La/u3i;

.field public final synthetic f:La/u3i;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Lkotlin/jvm/functions/Function1;

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(La/mm40;La/b4i;La/u3i;La/u3i;La/u3i;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/j3i;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/j3i;->b:La/mm40;

    iput-object p2, p0, La/j3i;->c:La/b4i;

    iput-object p3, p0, La/j3i;->d:La/u3i;

    iput-object p4, p0, La/j3i;->e:La/u3i;

    iput-object p5, p0, La/j3i;->f:La/u3i;

    iput-object p6, p0, La/j3i;->g:Ljava/lang/String;

    iput-object p7, p0, La/j3i;->h:Lkotlin/jvm/functions/Function1;

    iput p8, p0, La/j3i;->i:I

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;La/b4i;La/u3i;La/u3i;La/u3i;Lkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/j3i;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/j3i;->b:La/mm40;

    iput-object p2, p0, La/j3i;->g:Ljava/lang/String;

    iput-object p3, p0, La/j3i;->c:La/b4i;

    iput-object p4, p0, La/j3i;->d:La/u3i;

    iput-object p5, p0, La/j3i;->e:La/u3i;

    iput-object p6, p0, La/j3i;->f:La/u3i;

    iput-object p7, p0, La/j3i;->h:Lkotlin/jvm/functions/Function1;

    iput p8, p0, La/j3i;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/j3i;->a:B

    .line 2
    .line 3
    iget v1, p0, La/j3i;->i:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v7, p1

    .line 9
    check-cast v7, La/fet;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    or-int/lit8 p1, v1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    iget-object v3, p0, La/j3i;->d:La/u3i;

    .line 23
    .line 24
    iget-object v4, p0, La/j3i;->e:La/u3i;

    .line 25
    .line 26
    iget-object v5, p0, La/j3i;->f:La/u3i;

    .line 27
    .line 28
    iget-object v6, p0, La/j3i;->c:La/b4i;

    .line 29
    .line 30
    iget-object v8, p0, La/j3i;->b:La/mm40;

    .line 31
    .line 32
    iget-object v9, p0, La/j3i;->g:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v10, p0, La/j3i;->h:Lkotlin/jvm/functions/Function1;

    .line 35
    .line 36
    invoke-static/range {v2 .. v10}, La/qbc;->f(ILa/u3i;La/u3i;La/u3i;La/b4i;La/fet;La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_0
    move-object v5, p1

    .line 43
    check-cast v5, La/fet;

    .line 44
    .line 45
    check-cast p2, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    or-int/lit8 p1, v1, 0x1

    .line 51
    .line 52
    invoke-static {p1}, La/x8x;->L(I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v1, p0, La/j3i;->d:La/u3i;

    .line 57
    .line 58
    iget-object v2, p0, La/j3i;->e:La/u3i;

    .line 59
    .line 60
    iget-object v3, p0, La/j3i;->f:La/u3i;

    .line 61
    .line 62
    iget-object v4, p0, La/j3i;->c:La/b4i;

    .line 63
    .line 64
    iget-object v6, p0, La/j3i;->b:La/mm40;

    .line 65
    .line 66
    iget-object v7, p0, La/j3i;->g:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v8, p0, La/j3i;->h:Lkotlin/jvm/functions/Function1;

    .line 69
    .line 70
    invoke-static/range {v0 .. v8}, La/obc;->j(ILa/u3i;La/u3i;La/u3i;La/b4i;La/fet;La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 71
    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
