.class public final synthetic La/p2l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/u1m;

.field public final synthetic c:La/ope;

.field public final synthetic d:I

.field public final synthetic e:Z

.field public final synthetic f:Z

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(La/mm40;La/u1m;La/ope;IZZLkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/p2l0;->a:La/mm40;

    iput-object p2, p0, La/p2l0;->b:La/u1m;

    iput-object p3, p0, La/p2l0;->c:La/ope;

    iput p4, p0, La/p2l0;->d:I

    iput-boolean p5, p0, La/p2l0;->e:Z

    iput-boolean p6, p0, La/p2l0;->f:Z

    iput-object p7, p0, La/p2l0;->g:Lkotlin/jvm/functions/Function1;

    iput p8, p0, La/p2l0;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/p2l0;->h:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    iget-object v0, p0, La/p2l0;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/p2l0;->b:La/u1m;

    .line 20
    .line 21
    iget-object v2, p0, La/p2l0;->c:La/ope;

    .line 22
    .line 23
    iget v3, p0, La/p2l0;->d:I

    .line 24
    .line 25
    iget-boolean v4, p0, La/p2l0;->e:Z

    .line 26
    .line 27
    iget-boolean v5, p0, La/p2l0;->f:Z

    .line 28
    .line 29
    iget-object v6, p0, La/p2l0;->g:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    invoke-static/range {v0 .. v8}, La/l8x;->f(La/mm40;La/u1m;La/ope;IZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0
.end method
