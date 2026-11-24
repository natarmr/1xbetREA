.class public final synthetic La/hsh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;ZLa/mm40;I)V
    .locals 0

    .line 1
    const/4 p7, 0x0

    iput-byte p7, p0, La/hsh0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/hsh0;->e:I

    iput p2, p0, La/hsh0;->f:I

    iput-object p3, p0, La/hsh0;->c:Ljava/lang/String;

    iput-object p4, p0, La/hsh0;->g:Ljava/lang/Object;

    iput-boolean p5, p0, La/hsh0;->d:Z

    iput-object p6, p0, La/hsh0;->b:La/mm40;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;La/q7q0;ZII)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/hsh0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hsh0;->b:La/mm40;

    iput-object p2, p0, La/hsh0;->c:Ljava/lang/String;

    iput-object p3, p0, La/hsh0;->g:Ljava/lang/Object;

    iput-boolean p4, p0, La/hsh0;->d:Z

    iput p5, p0, La/hsh0;->e:I

    iput p6, p0, La/hsh0;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/hsh0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/hsh0;->g:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v3, v0

    .line 9
    check-cast v3, La/q7q0;

    .line 10
    .line 11
    move-object v6, p1

    .line 12
    check-cast v6, La/fet;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget p1, p0, La/hsh0;->f:I

    .line 20
    .line 21
    or-int/lit8 p1, p1, 0x1

    .line 22
    .line 23
    invoke-static {p1}, La/x8x;->L(I)I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    iget-object v1, p0, La/hsh0;->b:La/mm40;

    .line 28
    .line 29
    iget-object v2, p0, La/hsh0;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-boolean v4, p0, La/hsh0;->d:Z

    .line 32
    .line 33
    iget v5, p0, La/hsh0;->e:I

    .line 34
    .line 35
    invoke-static/range {v1 .. v7}, La/wgm0;->g(La/mm40;Ljava/lang/String;La/q7q0;ZILa/fet;I)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    iget-object v0, p0, La/hsh0;->g:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v4, v0

    .line 44
    check-cast v4, Ljava/lang/String;

    .line 45
    .line 46
    move-object v7, p1

    .line 47
    check-cast v7, La/fet;

    .line 48
    .line 49
    check-cast p2, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x1

    .line 55
    invoke-static {p1}, La/x8x;->L(I)I

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    iget v1, p0, La/hsh0;->e:I

    .line 60
    .line 61
    iget v2, p0, La/hsh0;->f:I

    .line 62
    .line 63
    iget-object v3, p0, La/hsh0;->c:Ljava/lang/String;

    .line 64
    .line 65
    iget-boolean v5, p0, La/hsh0;->d:Z

    .line 66
    .line 67
    iget-object v6, p0, La/hsh0;->b:La/mm40;

    .line 68
    .line 69
    invoke-static/range {v1 .. v8}, La/t9x;->w(IILjava/lang/String;Ljava/lang/String;ZLa/mm40;La/fet;I)V

    .line 70
    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
