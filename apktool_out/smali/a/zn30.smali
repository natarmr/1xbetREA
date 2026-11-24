.class public final synthetic La/zn30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/rbe;


# instance fields
.field public final synthetic a:La/zhl;

.field public final synthetic b:La/wn00;

.field public final synthetic c:La/in30;

.field public final synthetic d:Ljava/io/IOException;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(La/zhl;La/wn00;La/in30;Ljava/io/IOException;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/zn30;->a:La/zhl;

    iput-object p2, p0, La/zn30;->b:La/wn00;

    iput-object p3, p0, La/zn30;->c:La/in30;

    iput-object p4, p0, La/zn30;->d:Ljava/io/IOException;

    iput-boolean p5, p0, La/zn30;->e:Z

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, La/bo30;

    .line 3
    .line 4
    iget-object p1, p0, La/zn30;->a:La/zhl;

    .line 5
    .line 6
    iget v1, p1, La/zhl;->a:I

    .line 7
    .line 8
    iget-object v2, p1, La/zhl;->b:La/vn30;

    .line 9
    .line 10
    iget-object v3, p0, La/zn30;->b:La/wn00;

    .line 11
    .line 12
    iget-object v4, p0, La/zn30;->c:La/in30;

    .line 13
    .line 14
    iget-object v5, p0, La/zn30;->d:Ljava/io/IOException;

    .line 15
    .line 16
    iget-boolean v6, p0, La/zn30;->e:Z

    .line 17
    .line 18
    invoke-interface/range {v0 .. v6}, La/bo30;->B(ILa/vn30;La/wn00;La/in30;Ljava/io/IOException;Z)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
