.class public final synthetic La/s7n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/l7m0;

.field public final synthetic c:Z

.field public final synthetic d:La/y9q0;

.field public final synthetic e:J

.field public final synthetic f:J

.field public final synthetic g:Z

.field public final synthetic h:S

.field public final synthetic i:B


# direct methods
.method public synthetic constructor <init>(La/mm40;La/l7m0;ZLa/y9q0;JJZII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/s7n;->a:La/mm40;

    iput-object p2, p0, La/s7n;->b:La/l7m0;

    iput-boolean p3, p0, La/s7n;->c:Z

    iput-object p4, p0, La/s7n;->d:La/y9q0;

    iput-wide p5, p0, La/s7n;->e:J

    iput-wide p7, p0, La/s7n;->f:J

    iput-boolean p9, p0, La/s7n;->g:Z

    iput-short p10, p0, La/s7n;->h:S

    iput-byte p11, p0, La/s7n;->i:B

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
    iget-short p1, p0, La/s7n;->h:S

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
    iget-object v0, p0, La/s7n;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/s7n;->b:La/l7m0;

    .line 20
    .line 21
    iget-boolean v2, p0, La/s7n;->c:Z

    .line 22
    .line 23
    iget-object v3, p0, La/s7n;->d:La/y9q0;

    .line 24
    .line 25
    iget-wide v4, p0, La/s7n;->e:J

    .line 26
    .line 27
    iget-wide v6, p0, La/s7n;->f:J

    .line 28
    .line 29
    iget-boolean v8, p0, La/s7n;->g:Z

    .line 30
    .line 31
    iget-byte v11, p0, La/s7n;->i:B

    .line 32
    .line 33
    invoke-static/range {v0 .. v11}, La/v7n;->d(La/mm40;La/l7m0;ZLa/y9q0;JJZLa/fet;II)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0
.end method
