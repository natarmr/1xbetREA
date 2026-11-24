.class public final La/aox;
.super Ljava/io/IOException;
.source "SourceFile"


# instance fields
.field public a:La/z3;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, La/aox;->a:La/z3;

    .line 6
    .line 7
    return-void
.end method

.method public static a()La/aox;
    .locals 2

    .line 1
    new-instance v0, La/aox;

    .line 2
    .line 3
    const-string v1, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length."

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/aox;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
