.class public final La/d01;
.super La/zhi0;
.source "SourceFile"


# instance fields
.field public final g:La/e01;


# direct methods
.method public constructor <init>(La/e01;)V
    .locals 4

    .line 1
    iget-object v0, p1, La/e01;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget v1, p1, La/e01;->c:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0xc

    .line 7
    .line 8
    invoke-direct {p0, v0, v1, v2, v3}, La/zhi0;-><init>(Ljava/lang/String;ILjava/lang/Integer;I)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, La/d01;->g:La/e01;

    .line 12
    .line 13
    return-void
.end method
