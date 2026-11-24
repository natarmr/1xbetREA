.class public final synthetic La/so8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/uo8;

.field public final synthetic b:La/mm40;

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:La/yjj0;

.field public final synthetic f:J


# direct methods
.method public synthetic constructor <init>(La/uo8;La/mm40;FFLa/yjj0;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/so8;->a:La/uo8;

    iput-object p2, p0, La/so8;->b:La/mm40;

    iput p3, p0, La/so8;->c:F

    iput p4, p0, La/so8;->d:F

    iput-object p5, p0, La/so8;->e:La/yjj0;

    iput-wide p6, p0, La/so8;->f:J

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
    const p1, 0x30001

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, La/x8x;->L(I)I

    .line 13
    .line 14
    .line 15
    move-result v8

    .line 16
    iget-object v0, p0, La/so8;->a:La/uo8;

    .line 17
    .line 18
    iget-object v1, p0, La/so8;->b:La/mm40;

    .line 19
    .line 20
    iget v2, p0, La/so8;->c:F

    .line 21
    .line 22
    iget v3, p0, La/so8;->d:F

    .line 23
    .line 24
    iget-object v4, p0, La/so8;->e:La/yjj0;

    .line 25
    .line 26
    iget-wide v5, p0, La/so8;->f:J

    .line 27
    .line 28
    invoke-virtual/range {v0 .. v8}, La/uo8;->a(La/mm40;FFLa/yjj0;JLa/fet;I)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0
.end method
