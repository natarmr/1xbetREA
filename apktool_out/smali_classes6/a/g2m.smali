.class public final synthetic La/g2m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:Z

.field public final synthetic c:La/l7m0;

.field public final synthetic d:Z

.field public final synthetic e:La/l7m0;

.field public final synthetic f:La/l7m0;

.field public final synthetic g:J


# direct methods
.method public synthetic constructor <init>(La/mm40;ZLa/l7m0;ZLa/l7m0;La/l7m0;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/g2m;->a:La/mm40;

    iput-boolean p2, p0, La/g2m;->b:Z

    iput-object p3, p0, La/g2m;->c:La/l7m0;

    iput-boolean p4, p0, La/g2m;->d:Z

    iput-object p5, p0, La/g2m;->e:La/l7m0;

    iput-object p6, p0, La/g2m;->f:La/l7m0;

    iput-wide p7, p0, La/g2m;->g:J

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
    const p1, 0x30181

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, La/x8x;->L(I)I

    .line 13
    .line 14
    .line 15
    move-result v9

    .line 16
    iget-object v0, p0, La/g2m;->a:La/mm40;

    .line 17
    .line 18
    iget-boolean v1, p0, La/g2m;->b:Z

    .line 19
    .line 20
    iget-object v2, p0, La/g2m;->c:La/l7m0;

    .line 21
    .line 22
    iget-boolean v3, p0, La/g2m;->d:Z

    .line 23
    .line 24
    iget-object v4, p0, La/g2m;->e:La/l7m0;

    .line 25
    .line 26
    iget-object v5, p0, La/g2m;->f:La/l7m0;

    .line 27
    .line 28
    iget-wide v6, p0, La/g2m;->g:J

    .line 29
    .line 30
    invoke-static/range {v0 .. v9}, La/rcb;->w(La/mm40;ZLa/l7m0;ZLa/l7m0;La/l7m0;JLa/fet;I)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0
.end method
