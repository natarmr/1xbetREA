.class public final synthetic La/n2l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:La/ope;

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;La/ope;IILkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/n2l0;->a:La/mm40;

    iput-object p2, p0, La/n2l0;->b:Ljava/lang/String;

    iput-object p3, p0, La/n2l0;->c:La/ope;

    iput p4, p0, La/n2l0;->d:I

    iput p5, p0, La/n2l0;->e:I

    iput-object p6, p0, La/n2l0;->f:Lkotlin/jvm/functions/Function1;

    iput p7, p0, La/n2l0;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/n2l0;->g:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    iget-object v0, p0, La/n2l0;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/n2l0;->b:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v2, p0, La/n2l0;->c:La/ope;

    .line 22
    .line 23
    iget v3, p0, La/n2l0;->d:I

    .line 24
    .line 25
    iget v4, p0, La/n2l0;->e:I

    .line 26
    .line 27
    iget-object v5, p0, La/n2l0;->f:Lkotlin/jvm/functions/Function1;

    .line 28
    .line 29
    invoke-static/range {v0 .. v7}, La/l8x;->N(La/mm40;Ljava/lang/String;La/ope;IILkotlin/jvm/functions/Function1;La/fet;I)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0
.end method
