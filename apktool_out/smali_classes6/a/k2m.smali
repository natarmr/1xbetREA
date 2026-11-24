.class public final synthetic La/k2m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/o0x;

.field public final synthetic b:I

.field public final synthetic c:La/y3d;

.field public final synthetic d:J

.field public final synthetic e:S


# direct methods
.method public synthetic constructor <init>(La/o0x;ILa/y3d;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/k2m;->a:La/o0x;

    iput p2, p0, La/k2m;->b:I

    iput-object p3, p0, La/k2m;->c:La/y3d;

    iput-wide p4, p0, La/k2m;->d:J

    iput-short p6, p0, La/k2m;->e:S

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-short p1, p0, La/k2m;->e:S

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    iget-object v0, p0, La/k2m;->a:La/o0x;

    .line 18
    .line 19
    iget v1, p0, La/k2m;->b:I

    .line 20
    .line 21
    iget-object v2, p0, La/k2m;->c:La/y3d;

    .line 22
    .line 23
    iget-wide v3, p0, La/k2m;->d:J

    .line 24
    .line 25
    invoke-static/range {v0 .. v6}, La/vdb;->d(La/o0x;ILa/y3d;JLa/fet;I)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0
.end method
