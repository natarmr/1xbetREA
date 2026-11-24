.class public final synthetic La/r6m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z

.field public final synthetic e:F


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;Ljava/lang/String;ZFI)V
    .locals 0

    .line 1
    sget-object p6, La/u6m;->a:La/u6m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/r6m;->a:La/mm40;

    iput-object p2, p0, La/r6m;->b:Ljava/lang/String;

    iput-object p3, p0, La/r6m;->c:Ljava/lang/String;

    iput-boolean p4, p0, La/r6m;->d:Z

    iput p5, p0, La/r6m;->e:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, La/u6m;->a:La/u6m;

    .line 2
    .line 3
    move-object v6, p1

    .line 4
    check-cast v6, La/fet;

    .line 5
    .line 6
    check-cast p2, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/16 p1, 0x6001

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    iget-object v1, p0, La/r6m;->a:La/mm40;

    .line 18
    .line 19
    iget-object v2, p0, La/r6m;->b:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v3, p0, La/r6m;->c:Ljava/lang/String;

    .line 22
    .line 23
    iget-boolean v4, p0, La/r6m;->d:Z

    .line 24
    .line 25
    iget v5, p0, La/r6m;->e:F

    .line 26
    .line 27
    invoke-static/range {v1 .. v7}, La/oja0;->A(La/mm40;Ljava/lang/String;Ljava/lang/String;ZFLa/fet;I)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0
.end method
