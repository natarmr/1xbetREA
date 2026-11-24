.class public final synthetic La/xjm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:I

.field public final synthetic g:B

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/uc00;ZZLkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/xjm;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/xjm;->b:La/mm40;

    iput-object p2, p0, La/xjm;->h:Ljava/lang/Object;

    iput-boolean p3, p0, La/xjm;->c:Z

    iput-boolean p4, p0, La/xjm;->d:Z

    iput-object p5, p0, La/xjm;->e:Lkotlin/jvm/functions/Function1;

    iput p6, p0, La/xjm;->f:I

    iput-byte p7, p0, La/xjm;->g:B

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;ZZLa/gy40;Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/xjm;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/xjm;->b:La/mm40;

    iput-boolean p2, p0, La/xjm;->c:Z

    iput-boolean p3, p0, La/xjm;->d:Z

    iput-object p4, p0, La/xjm;->h:Ljava/lang/Object;

    iput-object p5, p0, La/xjm;->e:Lkotlin/jvm/functions/Function1;

    iput p6, p0, La/xjm;->f:I

    iput-byte p7, p0, La/xjm;->g:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/xjm;->a:B

    .line 2
    .line 3
    iget v1, p0, La/xjm;->f:I

    .line 4
    .line 5
    iget-object v2, p0, La/xjm;->h:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object v6, v2

    .line 11
    check-cast v6, La/gy40;

    .line 12
    .line 13
    move-object v8, p1

    .line 14
    check-cast v8, La/fet;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    or-int/lit8 p1, v1, 0x1

    .line 22
    .line 23
    invoke-static {p1}, La/x8x;->L(I)I

    .line 24
    .line 25
    .line 26
    move-result v9

    .line 27
    iget-object v3, p0, La/xjm;->b:La/mm40;

    .line 28
    .line 29
    iget-boolean v4, p0, La/xjm;->c:Z

    .line 30
    .line 31
    iget-boolean v5, p0, La/xjm;->d:Z

    .line 32
    .line 33
    iget-object v7, p0, La/xjm;->e:Lkotlin/jvm/functions/Function1;

    .line 34
    .line 35
    iget-byte v10, p0, La/xjm;->g:B

    .line 36
    .line 37
    invoke-static/range {v3 .. v10}, La/n5n;->b(La/mm40;ZZLa/gy40;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_0
    check-cast v2, La/uc00;

    .line 44
    .line 45
    move-object v5, p1

    .line 46
    check-cast v5, La/fet;

    .line 47
    .line 48
    check-cast p2, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    or-int/lit8 p1, v1, 0x1

    .line 54
    .line 55
    invoke-static {p1}, La/x8x;->L(I)I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    iget-object v0, p0, La/xjm;->b:La/mm40;

    .line 60
    .line 61
    move-object v1, v2

    .line 62
    iget-boolean v2, p0, La/xjm;->c:Z

    .line 63
    .line 64
    iget-boolean v3, p0, La/xjm;->d:Z

    .line 65
    .line 66
    iget-object v4, p0, La/xjm;->e:Lkotlin/jvm/functions/Function1;

    .line 67
    .line 68
    iget-byte v7, p0, La/xjm;->g:B

    .line 69
    .line 70
    invoke-static/range {v0 .. v7}, La/f7k;->k(La/mm40;La/uc00;ZZLkotlin/jvm/functions/Function1;La/fet;II)V

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
