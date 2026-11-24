.class public final synthetic La/a36;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/q7q0;

.field public final synthetic d:Z

.field public final synthetic e:Z

.field public final synthetic f:Z

.field public final synthetic g:Z

.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/p6q0;La/q7q0;ZZZZLkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/a36;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/a36;->b:La/mm40;

    iput-object p2, p0, La/a36;->i:Ljava/lang/Object;

    iput-object p3, p0, La/a36;->c:La/q7q0;

    iput-boolean p4, p0, La/a36;->d:Z

    iput-boolean p5, p0, La/a36;->e:Z

    iput-boolean p6, p0, La/a36;->f:Z

    iput-boolean p7, p0, La/a36;->g:Z

    iput-object p8, p0, La/a36;->j:Ljava/lang/Object;

    iput p9, p0, La/a36;->h:I

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;Ljava/lang/String;La/q7q0;ZZZZII)V
    .locals 0

    .line 2
    const/4 p10, 0x0

    iput-byte p10, p0, La/a36;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/a36;->b:La/mm40;

    iput-object p2, p0, La/a36;->i:Ljava/lang/Object;

    iput-object p3, p0, La/a36;->j:Ljava/lang/Object;

    iput-object p4, p0, La/a36;->c:La/q7q0;

    iput-boolean p5, p0, La/a36;->d:Z

    iput-boolean p6, p0, La/a36;->e:Z

    iput-boolean p7, p0, La/a36;->f:Z

    iput-boolean p8, p0, La/a36;->g:Z

    iput p9, p0, La/a36;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/a36;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/a36;->i:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, La/p6q0;

    .line 10
    .line 11
    iget-object v0, p0, La/a36;->j:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v8, v0

    .line 14
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    move-object v9, p1

    .line 17
    check-cast v9, La/fet;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget p1, p0, La/a36;->h:I

    .line 25
    .line 26
    or-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    invoke-static {p1}, La/x8x;->L(I)I

    .line 29
    .line 30
    .line 31
    move-result v10

    .line 32
    iget-object v1, p0, La/a36;->b:La/mm40;

    .line 33
    .line 34
    iget-object v3, p0, La/a36;->c:La/q7q0;

    .line 35
    .line 36
    iget-boolean v4, p0, La/a36;->d:Z

    .line 37
    .line 38
    iget-boolean v5, p0, La/a36;->e:Z

    .line 39
    .line 40
    iget-boolean v6, p0, La/a36;->f:Z

    .line 41
    .line 42
    iget-boolean v7, p0, La/a36;->g:Z

    .line 43
    .line 44
    invoke-static/range {v1 .. v10}, La/g7x;->l(La/mm40;La/p6q0;La/q7q0;ZZZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_0
    iget-object v0, p0, La/a36;->i:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v2, v0

    .line 53
    check-cast v2, Ljava/lang/String;

    .line 54
    .line 55
    iget-object v0, p0, La/a36;->j:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v3, v0

    .line 58
    check-cast v3, Ljava/lang/String;

    .line 59
    .line 60
    move-object v10, p1

    .line 61
    check-cast v10, La/fet;

    .line 62
    .line 63
    check-cast p2, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    const/4 p1, 0x7

    .line 69
    invoke-static {p1}, La/x8x;->L(I)I

    .line 70
    .line 71
    .line 72
    move-result v11

    .line 73
    iget-object v1, p0, La/a36;->b:La/mm40;

    .line 74
    .line 75
    iget-object v4, p0, La/a36;->c:La/q7q0;

    .line 76
    .line 77
    iget-boolean v5, p0, La/a36;->d:Z

    .line 78
    .line 79
    iget-boolean v6, p0, La/a36;->e:Z

    .line 80
    .line 81
    iget-boolean v7, p0, La/a36;->f:Z

    .line 82
    .line 83
    iget-boolean v8, p0, La/a36;->g:Z

    .line 84
    .line 85
    iget v9, p0, La/a36;->h:I

    .line 86
    .line 87
    invoke-static/range {v1 .. v11}, La/h36;->c(La/mm40;Ljava/lang/String;Ljava/lang/String;La/q7q0;ZZZZILa/fet;I)V

    .line 88
    .line 89
    .line 90
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
