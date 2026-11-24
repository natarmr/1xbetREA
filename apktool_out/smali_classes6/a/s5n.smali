.class public final synthetic La/s5n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/n6q0;ZZZLkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/s5n;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/s5n;->f:Ljava/lang/Object;

    iput-boolean p2, p0, La/s5n;->b:Z

    iput-boolean p3, p0, La/s5n;->c:Z

    iput-boolean p4, p0, La/s5n;->d:Z

    iput-object p5, p0, La/s5n;->g:Ljava/lang/Object;

    iput p6, p0, La/s5n;->e:I

    return-void
.end method

.method public synthetic constructor <init>(La/s4i;ZZLa/qao0;ZI)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/s5n;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/s5n;->f:Ljava/lang/Object;

    iput-boolean p2, p0, La/s5n;->b:Z

    iput-boolean p3, p0, La/s5n;->c:Z

    iput-object p4, p0, La/s5n;->g:Ljava/lang/Object;

    iput-boolean p5, p0, La/s5n;->d:Z

    iput p6, p0, La/s5n;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/s5n;->a:B

    .line 2
    .line 3
    iget v1, p0, La/s5n;->e:I

    .line 4
    .line 5
    iget-object v2, p0, La/s5n;->g:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/s5n;->f:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v4, v3

    .line 13
    check-cast v4, La/n6q0;

    .line 14
    .line 15
    move-object v8, v2

    .line 16
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 17
    .line 18
    move-object v9, p1

    .line 19
    check-cast v9, La/fet;

    .line 20
    .line 21
    check-cast p2, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    or-int/lit8 p1, v1, 0x1

    .line 27
    .line 28
    invoke-static {p1}, La/x8x;->L(I)I

    .line 29
    .line 30
    .line 31
    move-result v10

    .line 32
    iget-boolean v5, p0, La/s5n;->b:Z

    .line 33
    .line 34
    iget-boolean v6, p0, La/s5n;->c:Z

    .line 35
    .line 36
    iget-boolean v7, p0, La/s5n;->d:Z

    .line 37
    .line 38
    invoke-static/range {v4 .. v10}, La/g7x;->b(La/n6q0;ZZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_0
    move-object v0, v3

    .line 45
    check-cast v0, La/s4i;

    .line 46
    .line 47
    move-object v3, v2

    .line 48
    check-cast v3, La/qao0;

    .line 49
    .line 50
    move-object v5, p1

    .line 51
    check-cast v5, La/fet;

    .line 52
    .line 53
    check-cast p2, Ljava/lang/Integer;

    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    or-int/lit8 p1, v1, 0x1

    .line 59
    .line 60
    invoke-static {p1}, La/x8x;->L(I)I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    iget-boolean v1, p0, La/s5n;->b:Z

    .line 65
    .line 66
    iget-boolean v2, p0, La/s5n;->c:Z

    .line 67
    .line 68
    iget-boolean v4, p0, La/s5n;->d:Z

    .line 69
    .line 70
    invoke-static/range {v0 .. v6}, La/z5n;->e(La/s4i;ZZLa/qao0;ZLa/fet;I)V

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
