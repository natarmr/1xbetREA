.class public final synthetic La/jqm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/a4x;

.field public final synthetic c:F

.field public final synthetic d:La/ywh0;

.field public final synthetic e:F

.field public final synthetic f:La/y9q0;

.field public final synthetic g:I

.field public final synthetic h:Lkotlin/jvm/functions/Function1;

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(La/mm40;La/a4x;FLa/ywh0;FLa/y9q0;ILkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/jqm;->a:La/mm40;

    iput-object p2, p0, La/jqm;->b:La/a4x;

    iput p3, p0, La/jqm;->c:F

    iput-object p4, p0, La/jqm;->d:La/ywh0;

    iput p5, p0, La/jqm;->e:F

    iput-object p6, p0, La/jqm;->f:La/y9q0;

    iput p7, p0, La/jqm;->g:I

    iput-object p8, p0, La/jqm;->h:Lkotlin/jvm/functions/Function1;

    iput p9, p0, La/jqm;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/jqm;->i:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v9

    .line 17
    iget-object v0, p0, La/jqm;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/jqm;->b:La/a4x;

    .line 20
    .line 21
    iget v2, p0, La/jqm;->c:F

    .line 22
    .line 23
    iget-object v3, p0, La/jqm;->d:La/ywh0;

    .line 24
    .line 25
    iget v4, p0, La/jqm;->e:F

    .line 26
    .line 27
    iget-object v5, p0, La/jqm;->f:La/y9q0;

    .line 28
    .line 29
    iget v6, p0, La/jqm;->g:I

    .line 30
    .line 31
    iget-object v7, p0, La/jqm;->h:Lkotlin/jvm/functions/Function1;

    .line 32
    .line 33
    invoke-static/range {v0 .. v9}, La/ibc;->J(La/mm40;La/a4x;FLa/ywh0;FLa/y9q0;ILkotlin/jvm/functions/Function1;La/fet;I)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0
.end method
