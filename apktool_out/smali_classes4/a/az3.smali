.class public final synthetic La/az3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/qz3;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:La/mm40;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:La/u12;

.field public final synthetic g:La/qge;

.field public final synthetic h:La/a4d;

.field public final synthetic i:Z

.field public final synthetic j:I

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(La/qz3;Ljava/lang/String;La/mm40;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/u12;La/qge;La/a4d;ZII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/az3;->a:La/qz3;

    iput-object p2, p0, La/az3;->b:Ljava/lang/String;

    iput-object p3, p0, La/az3;->c:La/mm40;

    iput-object p4, p0, La/az3;->d:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, La/az3;->e:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, La/az3;->f:La/u12;

    iput-object p7, p0, La/az3;->g:La/qge;

    iput-object p8, p0, La/az3;->h:La/a4d;

    iput-boolean p9, p0, La/az3;->i:Z

    iput p10, p0, La/az3;->j:I

    iput p11, p0, La/az3;->k:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/az3;->j:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v10

    .line 17
    iget p1, p0, La/az3;->k:I

    .line 18
    .line 19
    invoke-static {p1}, La/x8x;->L(I)I

    .line 20
    .line 21
    .line 22
    move-result v11

    .line 23
    iget-object v0, p0, La/az3;->a:La/qz3;

    .line 24
    .line 25
    iget-object v1, p0, La/az3;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v2, p0, La/az3;->c:La/mm40;

    .line 28
    .line 29
    iget-object v3, p0, La/az3;->d:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    iget-object v4, p0, La/az3;->e:Lkotlin/jvm/functions/Function1;

    .line 32
    .line 33
    iget-object v5, p0, La/az3;->f:La/u12;

    .line 34
    .line 35
    iget-object v6, p0, La/az3;->g:La/qge;

    .line 36
    .line 37
    iget-object v7, p0, La/az3;->h:La/a4d;

    .line 38
    .line 39
    iget-boolean v8, p0, La/az3;->i:Z

    .line 40
    .line 41
    invoke-static/range {v0 .. v11}, La/dj8;->e(La/qz3;Ljava/lang/String;La/mm40;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/u12;La/qge;La/a4d;ZLa/fet;II)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0
.end method
