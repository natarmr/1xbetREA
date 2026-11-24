.class public final synthetic La/j6m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;JLjava/lang/String;La/a4x;ZLkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/j6m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/j6m;->b:La/mm40;

    iput-wide p2, p0, La/j6m;->c:J

    iput-object p4, p0, La/j6m;->g:Ljava/lang/Object;

    iput-object p5, p0, La/j6m;->h:Ljava/lang/Object;

    iput-boolean p6, p0, La/j6m;->d:Z

    iput-object p7, p0, La/j6m;->e:Lkotlin/jvm/functions/Function1;

    iput p8, p0, La/j6m;->f:I

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/d8n;ZJLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/j6m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/j6m;->b:La/mm40;

    iput-object p2, p0, La/j6m;->g:Ljava/lang/Object;

    iput-boolean p3, p0, La/j6m;->d:Z

    iput-wide p4, p0, La/j6m;->c:J

    iput-object p6, p0, La/j6m;->e:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, La/j6m;->h:Ljava/lang/Object;

    iput p8, p0, La/j6m;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/j6m;->a:B

    .line 2
    .line 3
    iget v1, p0, La/j6m;->f:I

    .line 4
    .line 5
    iget-object v2, p0, La/j6m;->h:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/j6m;->g:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v7, v3

    .line 13
    check-cast v7, Ljava/lang/String;

    .line 14
    .line 15
    move-object v8, v2

    .line 16
    check-cast v8, La/a4x;

    .line 17
    .line 18
    move-object v11, p1

    .line 19
    check-cast v11, La/fet;

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
    move-result v12

    .line 32
    iget-object v4, p0, La/j6m;->b:La/mm40;

    .line 33
    .line 34
    iget-wide v5, p0, La/j6m;->c:J

    .line 35
    .line 36
    iget-boolean v9, p0, La/j6m;->d:Z

    .line 37
    .line 38
    iget-object v10, p0, La/j6m;->e:Lkotlin/jvm/functions/Function1;

    .line 39
    .line 40
    invoke-static/range {v4 .. v12}, La/ieb;->q(La/mm40;JLjava/lang/String;La/a4x;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_0
    check-cast v3, La/d8n;

    .line 47
    .line 48
    move-object v6, v2

    .line 49
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 50
    .line 51
    move-object v7, p1

    .line 52
    check-cast v7, La/fet;

    .line 53
    .line 54
    check-cast p2, Ljava/lang/Integer;

    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    or-int/lit8 p1, v1, 0x1

    .line 60
    .line 61
    invoke-static {p1}, La/x8x;->L(I)I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    iget-object v0, p0, La/j6m;->b:La/mm40;

    .line 66
    .line 67
    iget-boolean v2, p0, La/j6m;->d:Z

    .line 68
    .line 69
    move-object v1, v3

    .line 70
    iget-wide v3, p0, La/j6m;->c:J

    .line 71
    .line 72
    iget-object v5, p0, La/j6m;->e:Lkotlin/jvm/functions/Function1;

    .line 73
    .line 74
    invoke-static/range {v0 .. v8}, La/slb;->m(La/mm40;La/d8n;ZJLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 75
    .line 76
    .line 77
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object p0

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
